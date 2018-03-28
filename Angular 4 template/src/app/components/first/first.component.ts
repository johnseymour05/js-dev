import { Component,  OnInit } from '@angular/core';
import {Flashcard} from '../../beans/Flashcard';

@Component({
 selector: 'app-first',
 templateUrl: './first.component.html',
 styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {
    newCard = new Flashcard;
    flashcards: Array<Flashcard>;
   constructor() {
   }
   ngOnInit() {
    this.flashcards = [
    {
        question: 'what is angular',
        answer: 'angular is a framework',
        show: false
    },
    {
        question: 'what is ts',
        answer: 'a language',
        show: false
    }
];
   }

   toggle(flashcard) {
       flashcard.show = !flashcard.show;
   }
   addNewCard() {
       this.flashcards.push(this.newCard);
       this.newCard = new Flashcard;
   }
   remove(flashcard) {
       console.log('removing');
       this.flashcards = this.flashcards.filter((element) => {
            return element !== flashcard;
       });
   }
}
