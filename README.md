<h1> xy-inc </h1>

Serviço de Pontos de Interesse que permite ao usuário cadastrar pontos de interesse, buscar todos os pontos de interesse cadastrados e também realizar a busca por pontos de interesse próximo.
Foi criado um WebService em linguagem Java se utilizando do framework Spring Boot em um modelo REST. 
<br>
A ferramenta Postman foi utilizada para executar e testar os serviços implementados.

<ol> <h2> Cadastrar POI's</h2> </ol>

Serviço criado para cadastrar pontos de interesse, chamado pela URI: http://localhost:8080/pontosInteresse utilizando o método HTTP POST.
Necessário criar um Request Body com os atributos: nome, coordenadax, coordenaday.

![screenshot 8](https://user-images.githubusercontent.com/10735013/65834351-677ede80-e2b0-11e9-9cb0-aa4e3d8f5a61.jpg)

Como Response da requisição obtivemos o Status 201 Created, retornando o POI inserido.

![screenshot 9](https://user-images.githubusercontent.com/10735013/65834399-c6445800-e2b0-11e9-94d0-b4b53862d880.jpg)

 <ol> Listar POI's </ol>
 
 Serviço criado para cadastrar pontos de interesse, chamado pela URI: http://localhost:8080/pontosInteresse utilizando o método HTTP POST.
Necessário criar um Request Body com os atributos: nome, coordenadax, coordenaday.
 
 ![screenshot 4](https://user-images.githubusercontent.com/10735013/65834093-d870c700-e2ad-11e9-81d7-16c990681ace.jpg)
 
  <ol> Buscar POI's por proximidade </ol>

Serviço criado para buscar todos os pontos de interesse, chamado pela URI: http://localhost:8080/pontosInteresse utilizando o método HTTP GET.
 
![screenshot 5](https://user-images.githubusercontent.com/10735013/65834108-0950fc00-e2ae-11e9-8cd2-59555c040915.jpg)
