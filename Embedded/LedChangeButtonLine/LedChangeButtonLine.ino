int leds[] = {1,2,3,4,5,6,7,8,9,10};
int buttonPin = 12;
int newButtonState = 0;
int oldButtonState = 0;
int blinkMode = 1;
int delayTime = 100;
long previousMillis = 0;
long interval = 100;
int on = 1; 
unsigned long currentMillis;

void setup()
{
  for (int i = 0; i < 10; i++)
  {
    pinMode(leds[i], OUTPUT);
  }
  pinMode(12, INPUT);
}

void loop()
{
  currentMillis = millis();
  ButtonPress();
  
  switch (blinkMode)
  {
    case 1:
      BlinkRandom();
      break;
    case 2:
      BlinkAll();
      break;
  }
}
    

void ButtonPress()
{
  if (digitalRead(buttonPin) == LOW)
  {
    blinkMode++;
    
    if (blinkMode == 3)
    {
      blinkMode = 1;
    }
  }
}

void BlinkRandom()
{
  if (currentMillis - previousMillis > interval)
  {
    previousMillis = currentMillis;
    
    digitalWrite(leds[random(10)], HIGH);
    digitalWrite(leds[random(10)], LOW);
  }
    ButtonPress();
    
}

void BlinkAll()
{
  if (on == 1)
  {
    if (currentMillis - previousMillis > interval)
    {
      previousMillis = currentMillis;
      for (int i = 0; i < 10; i++)
      {
        digitalWrite(leds[i], HIGH);
      }
      on = 0;
    }
  }
  else
  {
    if (currentMillis - previousMillis > interval)
    {
      previousMillis = currentMillis;
      for (int i = 0; i < 10; i++)
      {
       digitalWrite(leds[i], LOW);
      }
      on = 1;
    }
  }
  ButtonPress();
}
  
  
