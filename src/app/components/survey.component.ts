import { Component, OnInit } from "@angular/core";
import { Model } from "survey-core";
import { HttpService } from "../services/httpServices";
@Component({
    selector: "survey-home",
    templateUrl: './survey.component.html',
})
export class SurveyComponent implements OnInit {
    surveyModel: any;

    constructor(public http: HttpService) { 
    }

    ngOnInit() {
        const json = {
            pages: [{
                elements: [{
                    name: "1",
                    title: "How would you describe your experience with our Work?",
                    type: "radiogroup",
                    choices: [
                        { value: 5, text: "Fully satisfying" },
                        { value: 4, text: "Generally satisfying" },
                        { value: 3, text: "Neutral" },
                        { value: 2, text: "Rather unsatisfying" },
                        { value: 1, text: "Not satisfying at all" }
                    ],
                    isRequired: true
                }]
            }, {
                elements: [{
                    name: "2",
                    title: "What can we do to make your experience more satisfying?",
                    type: "comment",
                }, {
                    name: "2",
                    title: "On a scale of zero to ten, how likely are you to recommend our product to a friend or colleague?",
                    type: "rating",
                    rateMin: 0,
                    rateMax: 10
                }],
            }, {
                elements: [{
                    name: "3",
                    title: "In your opinion, how could we improve our Work Process?",
                    type: "comment"
                }],
            }, {
                elements: [{
                    name: "4",
                    title: "Please let us know why you had such a disappointing experience with our Work",
                    type: "comment"
                }],
            }]
        };
        const survey = new Model(json);
        survey.onComplete.add(this.alertResults);
        this.surveyModel = survey;

    }

    alertResults(sender: any) {
        const results = sender.data;
        const list = [];
        for (const key in results) {
            list.push({
                qNumber: key,
                qAns: results[key]
            });
        }
        this.http.saveResponse(list);
    }
    
}
