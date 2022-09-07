### Java version
JDK 11
### Gradle version
Version 7.5

##
This project has two types of writers: String Writer and File Writer("test.txt" file is using from the root of the project)

Project written with TDD. The factory method pattern was used to create writers.

##
methods from the description were implemented:
- ###### Close - After closing, writer will not write anything
- ###### Write - Write the content
- ###### Read - Read the content
- ###### ToLowerCase - Convert the content to lower case
- ###### ToUppercase - Convert the content to upper case
- ###### replaceStupid - Replacing the word "stupid" (only in lower case) to "s*****"
- ###### removeDuplicates - Removing duplicated words from content
