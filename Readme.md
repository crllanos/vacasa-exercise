# Exercise

API for simple sum of numbers and counting words, consonants and vowels.

## Note
For sum operations, replace the plus "+" symbol for a coma ",". The plus sign is reserved in a querystring.

## Using the API

### Suming integers
~~~
curl --location --request GET 'http://localhost:8080/api/v1/exercise?q=1,2,3'
~~~

### Suming float point decimals
~~~
curl --location --request GET 'http://localhost:8080/api/v1/exercise?q=2.5,2.3'
~~~

### Counting words
~~~
curl --location --request GET 'http://localhost:8080/api/v1/exercise?q=la copa se mira'
~~~

