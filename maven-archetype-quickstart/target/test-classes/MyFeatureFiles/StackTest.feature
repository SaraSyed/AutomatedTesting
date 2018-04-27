Feature: Pushing to a stack
Scenario: Working with stacks
Given I have an empty stack
When I push to a stack
Then the stack should contain something