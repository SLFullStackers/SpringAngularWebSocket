import {Component, ElementRef, Inject, OnInit, ViewChild} from '@angular/core';
import {ScannerService} from '../scanner.service';
import {DomSanitizer} from '@angular/platform-browser';
declare var scanner;
@Component({
  selector: 'app-scanner',
  templateUrl: './scanner.component.html',
  styleUrls: ['./scanner.component.scss']
})
export class ScannerComponent implements OnInit {
  constructor(public scannerService: ScannerService, private domSanitizer: DomSanitizer) {}
  static image = null;
  ngOnInit() {
  }
  scanToJpg() {
    this.scannerService.scanDoc();
  }

}
