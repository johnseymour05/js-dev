import { Component,  OnInit } from '@angular/core';

@Component({
 selector: 'app-binding',
 templateUrl: './binding.component.html',
 styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {
    person = {
        name: 'john',
        haircolor: 'blonde'
    };

    counter = 0;
    constructor() {

    }

   ngOnInit() {
   }
   increment() {
       this.counter++;
   }
}
