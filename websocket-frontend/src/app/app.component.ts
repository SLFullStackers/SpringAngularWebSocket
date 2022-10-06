import {Component, HostListener} from '@angular/core';
import {MessageService} from './message.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'websocket-frontend';
  input;
  constructor(private messageService: MessageService) {}
  sendMessage() {
    if (this.input) {
      this.messageService.sendMessage(this.input);
      this.input = '';
    }
  }

  @HostListener('document:keydown', ['$event'])
  handleKeyboardEvent(event: KeyboardEvent) {
    if (event.key === 'Enter') {
      this.sendMessage();
    }
  }
}
