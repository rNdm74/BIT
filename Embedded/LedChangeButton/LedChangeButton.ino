int leds[] = {8, 9, 10};
int buttonPin = 5;
int litLed = 0;
int prevLed = 0;
void setup()
{
  pinMode(buttonPin, INPUT);
  pinMode(leds[0], OUTPUT);
  pinMode(leds[1], OUTPUT);
  pinMode(leds[2], OUTPUT);
}

void loop()
{
  if (digitalRead(buttonPin) == LOW)
  {
    prevLed = litLed;
    litLed++;
    if (litLed == 3)
    {
      litLed = 0;
    }
  }
  
  digitalWrite(leds[prevLed], LOW);
  digitalWrite(leds[litLed], HIGH);
}
  
