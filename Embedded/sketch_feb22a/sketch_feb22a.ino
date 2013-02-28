int leds[] = {1,2,3,4,5};

int delayTime = 100;

void setup()
{
  pinMode(leds[0], OUTPUT);
  pinMode(leds[1], OUTPUT);
  pinMode(leds[2], OUTPUT);
  pinMode(leds[3], OUTPUT);
  pinMode(leds[4], OUTPUT);
}

void loop()
{
  for (int i = 0; i < 100; i++)
  {
    digitalWrite(leds[random(1,6) - 1], HIGH);
    digitalWrite(leds[random(1,6) - 1], LOW);
    delay(delayTime);
  }
  boolean on = true;
  for (int i = 0; i < 5; i++)
  {
      digitalWrite(leds[i], LOW);
  }
  
  for (int y = 0; y < 10; y++)
  {
  for (int i = 0; i < 5; i++)
  {
    digitalWrite(leds[i], HIGH);
    delay(delayTime);  
  }
  for (int i = 4; i > 0; i--)
  {
    digitalWrite(leds[i], LOW);
    delay(delayTime);  
  }
  }
    
}  
  
