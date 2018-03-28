import { Component,  OnInit, Input } from '@angular/core';
import { Bean } from '../../beans/Bean';
@Component({
  selector: 'app-bean',
  templateUrl: './bean.component.html',
  styleUrls: ['./bean.component.css']
})
export class BeanComponent implements OnInit {
  @Input()
  in: Bean;
  beans: Array<Bean>;
  constructor() {
  }
  ngOnInit() {
    this.beans = [
    {
        name: 'Green',
        taste: 1,
        color: 'greenish'
    },
    {
        name: 'Black',
        taste: 2,
        color: 'tan'
    }
];
}
}
