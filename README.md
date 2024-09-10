# Caesar-Cipher

# How to use Caesar Cipher in English Letters
The Equation is C = (P + K) mod26 

* C Means Ciphertext

* P means Plaintext

* K  means the key of value

### when we want to encrypt the value we used this equation C = (P + K) mod 26 
### Same with decrypt algorithm we used C = (P - K) mod 26 

# Example 
crypt the Cipher text C = "Hello" using Caesar Cipher, given the key K = 3.
#### First we Should write the numbers and letter below each other, then hold the letter with the number above letter.
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25

A  B  C  D  E  F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z

#### Encrypt Solution
C = ( P + K) mod26 

H number 7 so  C = 7 + 3 = 10 = K 

E number 4 so C = 4 + 3 = 7 = H 

L number 11 so C = 11 + 3 = 14 = O 

L number 11 so C = 11 + 3 = 14 = O 

O number 14 so C = 14 + 3 = 17 = R

**KHOOR**
#### Dencrypt Solution
M = (P - K) mod 26 

K number 10 so M = 10 - 3 = 7 = H

H number 7 - 3 = 4 = E

O number 14 - 3 = 11 = L 

O number 14 - 3 = 11 = L 

R number = 17 - 3 = 14 = O 

**HELLO**
# Simple Solution
Simple Solution you can use Caeser Cipher without using mod 26 means.

if K = 3 u have to move 3 to right same with K = -3 move 3 to left and put the letter 
# Rules 

1. When u want to use Caeser Cipher with English letters you have to use mod 26 to stay in the range of letters
   
2. Caeser Cipher it's Circular algorithm means if the word had "Y number 24 + 3 it's 27" letter and the key is 3 when u encrypt it "Y" = "B"
  
 # Important point everything about the key, The Key can be changed anytime but the numbers of letters no.






