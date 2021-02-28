package com.addresbook;

import java.util.Comparator;

 class Sort {
     void NAME(Comparator.comparing(Person::getFirstName))
         void CITY (Comparator.comparing(Person::getCity)),
         void STATE (Comparator.comparing(Person::getState)),
         void ZIP (Comparator.comparing(Person::getZip));

         public Comparator<? super Person> comparator;

         void sortOptions (Comparator < ? super Person > comparator){
         this.comparator = comparator;
     }
     }
 }