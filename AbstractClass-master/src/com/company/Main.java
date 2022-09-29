package com.company;

public class Main {

    public static void main(String[] args) {


      GameCalculator []gameCalculators= new GameCalculator[]{new ManGameCalculator(),new KidsGameCalculator(),new WomanGameCalculator(),new OlderGameCalculator()};


      for(GameCalculator calculator:gameCalculators)
      {
          calculator.hesapla();
          calculator.gameOver();
      }

    }
}
