initial approach 
- put "open" brackets into stack
- while reading input by each character, if "closing" brackets is met, do stack.pop()
- see if it's a match 

1st + a
- put the matching parentheses in dict 
	- key: closing bracket, value: open bracket 
- when iterating over a string, check match_dict if key exist
	- if not, put it in a stack 
	- if yes, pop the stack 


