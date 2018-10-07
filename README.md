# Run-Length-Encoding
Run-length encoding (RLE) is a very simple form of lossless data compression. When encoding a text string, repeated consecutive characters are replaced by a single instance of that character and the number of occurrences of that character (the character’s run length). Decoding the encoded string results in the original string by repeating each character the number of times encoded by the run length.

Given code performs both encoding and decoding of the string.

Input consists of a single line of text. The line starts with a single letter: E for encode or D for decode. This letter is followed by a single space and then a message. No consecutive sequence of characters exceeds 9 repetitions.

Encoding -

Input 1:
E wwhhhysooooserriousss???

Output 1:
w2h3y1s1o4s1e1r2i1o1u1s3?3

Each string to decode has even length. Its characters alternate between the same characters as strings to encode and a single digit between 1 and 9, indicating the run length for the preceding character.

Decoding -

Input 1:
D w2h3y1s1o4s1e1r2i1o1u1s3?3

Output 1:
wwhhhysooooserriousss???
