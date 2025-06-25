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
