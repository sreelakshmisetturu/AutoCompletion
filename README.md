# AutoCompletion
Auto completion api using trie
Implemented a trie with insert, search,startsWith  and getSuggestions methods.
Example:
Trie trie = new Trie();
trie.insert("apple");
trie.search("apple");   // returns true
trie.search("app");     // returns false
trie.startsWith("app"); // returns true
trie.insert("app");   
trie.search("app");     // returns true
trie.getSuggestions("app");   // returns app,apple
