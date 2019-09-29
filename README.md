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

 <ol> <h2>Listar POI's </h2></ol>
 
Serviço criado para buscar todos os pontos de interesse, chamado pela URI: http://localhost:8080/pontosInteresse utilizando o método HTTP GET.
 
 ![screenshot 4](https://user-images.githubusercontent.com/10735013/65834093-d870c700-e2ad-11e9-81d7-16c990681ace.jpg)
 
  <ol> <h2> Buscar POI's por proximidade</h2> </ol>
 
 Serviço criado para buscar pontos de interesse por proximidade definido por uma distância máxima, chamado pela URI: http://localhost:8080/pontosInteresse/buscarPontosProximo  utilizando o método HTTP GET.
 Necessário criar um Request Body com os atributos: codx, cody, pontoRerencia, distMax.
 
![screenshot 10](https://user-images.githubusercontent.com/10735013/65834447-5d111480-e2b1-11e9-87d1-1e7190e5ca81.jpg)


Como Response da requisição obtivemos o Status 200 OKS, retornando oS POI's encontrados dentro da proximidade.
 
![screenshot 11](https://user-images.githubusercontent.com/10735013/65834469-ae210880-e2b1-11e9-852f-0d47211ea242.jpg)

