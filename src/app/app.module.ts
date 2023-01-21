import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { SurveyModule } from 'survey-angular-ui';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SurveyComponent } from './components/survey.component';
import { HttpClientModule } from '@angular/common/http';
import { HttpService } from './services/httpServices';

import {MatToolbarModule} from '@angular/material/toolbar';

@NgModule({
  declarations: [
    AppComponent, SurveyComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    SurveyModule,
    MatToolbarModule
  ],
  providers: [HttpService],
  bootstrap: [AppComponent]
})
export class AppModule { }
