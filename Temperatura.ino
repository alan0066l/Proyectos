#include <Wire.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>
#include <DHT.h>

#define SCREEN_WIDTH 128
#define SCREEN_HEIGHT 64

Adafruit_SSD1306 display(SCREEN_WIDTH, SCREEN_HEIGHT, &Wire, -1);

#define DHTPIN 2
#define DHTTYPE DHT11

DHT dht(DHTPIN, DHTTYPE);

#define RELAYPIN 8

#define BOTON_BLOQUEO 7
#define BOTON_AUTO 5

#define LED_ROJO 4
#define LED_AMARILLO 6

bool ventilador = false;
bool modoAutomatico = true;
bool bloqueo = false;

void setup() {

  Serial.begin(9600);

  dht.begin();

  if (!display.begin(SSD1306_SWITCHCAPVCC, 0x3C)) {

    Serial.println("OLED no encontrada");

    while (true);
  }

  display.clearDisplay();

  display.setTextSize(1);
  display.setTextColor(SSD1306_WHITE);

  display.setCursor(10, 25);
  display.println("Sistema iniciado");

  display.display();

  delay(2000);

  pinMode(RELAYPIN, OUTPUT);

  pinMode(BOTON_BLOQUEO, INPUT_PULLUP);
  pinMode(BOTON_AUTO, INPUT_PULLUP);

  pinMode(LED_ROJO, OUTPUT);
  pinMode(LED_AMARILLO, OUTPUT);

  digitalWrite(RELAYPIN, LOW);

  Serial.println("Sistema de temperatura iniciado");
}

void loop() {

  if (digitalRead(BOTON_BLOQUEO) == LOW) {

    bloqueo = !bloqueo;

    delay(300);
  }

  if (digitalRead(BOTON_AUTO) == LOW) {

    modoAutomatico = !modoAutomatico;

    delay(300);
  }

  float temperatura = dht.readTemperature();
  float humedad = dht.readHumidity();

  if (isnan(temperatura) || isnan(humedad)) {

    Serial.println("Error leyendo DHT11");

    display.clearDisplay();

    display.setCursor(0, 20);
    display.println("Error de sensor");

    display.display();

    delay(2000);

    return;
  }

  Serial.print("Temperatura: ");
  Serial.print(temperatura);
  Serial.println(" C");

  Serial.print("Humedad: ");
  Serial.print(humedad);
  Serial.println(" %");

  if (modoAutomatico && !bloqueo) {

    if (temperatura > 22 && ventilador == false) {

      digitalWrite(RELAYPIN, HIGH);

      ventilador = true;

      Serial.println("Ventilador ENCENDIDO");
    }

    if (temperatura < 21 && ventilador == true) {

      digitalWrite(RELAYPIN, LOW);

      ventilador = false;

      Serial.println("Ventilador APAGADO");
    }
  }

  if (ventilador) {

    digitalWrite(LED_ROJO, HIGH);
    digitalWrite(LED_AMARILLO, LOW);

  } else {

    digitalWrite(LED_ROJO, LOW);
    digitalWrite(LED_AMARILLO, HIGH);
  }

  display.clearDisplay();

  display.setTextSize(1);

  display.setCursor(0, 0);
  display.println("CONTROL TEMP");

  display.setCursor(0, 15);
  display.print("Temp: ");
  display.print(temperatura);
  display.println(" C");

  display.setCursor(0, 28);
  display.print("Hum: ");
  display.print(humedad);
  display.println(" %");

  display.setCursor(0, 42);

  if (ventilador) {

    display.println("Vent: ON");

  } else {

    display.println("Vent: OFF");
  }

  display.setCursor(0, 54);

  if (bloqueo) {

    display.println("Bloqueo: ACT");

  } else if (modoAutomatico) {

    display.println("Modo: AUTO");

  } else {

    display.println("Modo: MANUAL");
  }

  display.display();

  delay(1000);
}