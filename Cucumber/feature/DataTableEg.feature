Feature: This is login feature 
Scenario Outline: Login scenario
Given Go to URL
When enter "<Username>" and "<Password>"
And click login

Examples:
|Username|Password|
|Admin   |admin123|
|Admin   |admin333|