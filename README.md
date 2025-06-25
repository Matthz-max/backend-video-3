# 🏋️‍♂️ GYM - Backend

Este é o backend do projeto **GYM**, desenvolvido com **Spring Boot** e **MySQL**. Ele fornece uma API RESTful para poder criar um Exericio e colocar um peso.Você consegue ver o exercicio, editar, e deletar.

---

## 🚀 Tecnologias Utilizadas

- ✅ Java 21
- ✅ Eclipse ide
- ✅ Postman
- ✅ Workbeach
- ✅ Lombok  
- ✅ Maven  

---

---

##  Dependecias
 
- ✅ Spring Web  
- ✅ Spring Data JPA  
- ✅ MySQL Driver  
- ✅ Lombok  

---
# ✅ Como Ativar o Annotation Processing no Eclipse IDE

> ⚠️ Necessário apenas se você estiver usando **Eclipse IDE** 

---

## 🎯 Passo 1: Acessar as Propriedades do Projeto

➡️ Clique com o **botão direito no nome do projeto**, depois em **`Properties`**:

<img src="https://github.com/user-attachments/assets/76063295-c822-4f24-852d-662f86c83b18" width="400" />

---

## 🎯 Passo 2: Ativar o Annotation Processing

➡️ No menu lateral, clique em **`Java Compiler`** → **`Annotation Processing`**.

➡️ Ative as opções conforme a imagem:

✅ `Enable project specific settings`  
✅ `Enable annotation processing`  
✅ `Enable annotation processing in editor` (se aparecer)

<img src="https://github.com/user-attachments/assets/e215bedf-8f7e-4d9b-90fd-971627fe268e" width="400" />

---

## 🎯 Passo 3: Salvar e Fechar

➡️ Clique em **`Apply and Close`**

✅ O Eclipse pode pedir para **rebuildar o projeto**. Se sim, aceite.

---

## 🎯 Passo 4: Rodar o Maven Clean

➡️ Clique com **botão direito no projeto** → **`Run As`** → **`Maven clean`**

<img src="https://github.com/user-attachments/assets/f437c2ba-49a1-4c9c-aebd-1fdcc945f6d1" width="400" />

✅ Quando der certo, o console mostrará algo parecido com:
```
BUILD SUCCESS
```

---

## 🎯 Passo 5: Rodar o Maven Install (Build do Projeto)

➡️ Novamente com **botão direito no projeto** → **`Run As`** → **`Maven build...`**

➡️ Na janela que abrir, digite **`install`** no campo **Goals**.

<img src="https://github.com/user-attachments/assets/6141eca1-08a4-4cd0-b660-5d5d80e89727" width="400" />

Depois clique em **`Apply and Run`**.

✅ Resultado esperado no console:

<img src="https://github.com/user-attachments/assets/119e58d6-4fb0-41cc-ab6b-c711636adb96" width="400" />


```
BUILD SUCCESS
```

---

## ✅ Pronto!  
Agora o Projeto vai rodar tranquilo

# Banco de dados

é necessario ter um database para isso entre no workbeach, e escreve esse comando assim "create database backenddb" como a imagem abaixo demonstra.

<img src="https://github.com/user-attachments/assets/8c8cbfed-4455-49d0-aa86-6fd999057477" width="400" />
 
 

## ⚙️ Como rodar o projeto localmente
### Pré-requisitos

- Postman ou outra testador de Requisições
- Projeto rodando
- [Lombok](https://projectlombok.org/download)
- [Workbeach](https://dev.mysql.com/downloads/workbench/)
- IDE como **Eclipse** ou **IntelliJ**

---

## 📁 Estrutura de Pastas 

```plaintext
src
├── main
│   ├── java
│   │   └── com.matheus.crud.back_video_3
│   │       ├── BackVideo3Application.java
│   │       │ 
│   │       ├── com.matheus.crud.back_video_3.config
│   │       │   ├── RestExceptionHandler.java
│   │       │   └── WebConfig.java
│   │       ├── com.matheus.crud.back_video_3.controllers
│   │       │   └── RecordsController.java
│   │       │   
│   │       ├── com.matheus.crud.back_video_3.dtos
│   │       │   ├── ErrorDto.java
│   │       │   └── GymRecordDto.java
│   │       ├── com.matheus.crud.back_video_3.entities
│   │       │   └── GymRecord.java
│   │       │ 
│   │       ├── com.matheus.crud.back_video_3.exceptions
│   │       │   └── AppException.java
│   │       │
│   │       ├── com.matheus.crud.back_video_3.mappers
│   │       │   └── GymRecordMapper.java
│   │       │ 
│   │       ├── com.matheus.crud.back_video_3.repository
│   │       │   └── GymRecordsRepository.java
│   │       │
│   │       ├── com.matheus.crud.back_video_3.service
│   │           └── RecordsService.java
│   └── resources
│       ├── application.properties
│       └── static/
└── test

```
  # 🧪 Testes com Postman

<div align="center"> 
  <table> 
    <tr> 
      <td align="center"><strong>Método GET</strong></td> 
      <td style="width: 20px;"></td> 
      <td align="center"><strong>Método POST</strong></td> 
    </tr> 
    <tr> 
      <td>
        <img src="https://github.com/user-attachments/assets/c705848d-ee18-46cd-b4bb-24f5f213353c" alt="GET" width="400"/>
      </td> 
      <td></td> 
      <td>
        <img src="https://github.com/user-attachments/assets/e22a7f36-b9a8-4242-8b3f-e2e73937d18d" alt="POST" width="400"/>
      </td> 
    </tr> 
    <tr><td colspan="3" style="height: 20px;"></td></tr> <!-- Espaço entre as linhas -->
    <tr> 
      <td align="center"><strong>Método PUT</strong></td> 
      <td style="width: 20px;"></td> 
      <td align="center"><strong>Método DELETE</strong></td> 
    </tr> 
    <tr> 
      <td>
        <img src="https://github.com/user-attachments/assets/a3f5b439-fa8e-4f1e-a540-3337193def96" alt="PUT" width="400"/>
      </td> 
      <td></td> 
      <td>
        <img src="https://github.com/user-attachments/assets/dc3165f7-99b6-4d6c-9ceb-e7f37d96414e" alt="DELETE" width="400"/>
      </td> 
    </tr> 
    
  </table> 
</div>

# 📚 Referência
The Dev World - by Sergio Lema | DEV

Build a Complete CRUD Application with Spring Boot and React

https://www.youtube.com/watch?v=mxOcw4FZRa8


# 👨‍💻 Desenvolvedor

Feito com 💻 por Matheus Serafim da Silva
