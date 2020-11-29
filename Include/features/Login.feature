Feature:
Scenario Outline: Login to Config tool using valid credencial 
Given User navigate to config form 
When  User enter <username> and <password> 
And  user clik on login button 
Then user navigates to config home page 

 Examples:
| username | password |
| admin    | admin |
