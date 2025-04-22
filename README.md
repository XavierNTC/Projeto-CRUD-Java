# 📁 Projeto CRUD em Java - Padrão MVC

Este projeto é uma aplicação Java simples com funcionalidade de CRUD (Create, Read, Update, Delete), utilizando o padrão de arquitetura **MVC (Model-View-Controller)**. A estrutura está organizada em pacotes específicos para melhor separação de responsabilidades: `model`, `view`, `controller`, `dao` e `persistencia`.

---

## 🔧 Tecnologias Utilizadas

- Java (JDK 8+)
- JDBC (Java Database Connectivity)
- MySQL (ou outro banco relacional)
- IDE: Eclipse / IntelliJ / NetBeans (opcional)

---

## 🧱 Estrutura do Projeto

### 📦 `model`
Contém as **classes de modelo** que representam as entidades da aplicação. Cada classe aqui define os atributos e métodos relacionados aos dados que serão manipulados.

**Exemplo:** `Usuario.java`, `Produto.java`, etc.

---

### 📦 `view`
Responsável pela **interface com o usuário**. Pode ser implementada por meio de:
- Interface gráfica (Swing, JavaFX)
- Interface de linha de comando (CLI)

Aqui ficam os formulários, menus e elementos visuais que o usuário interage diretamente.

---

### 📦 `controller`
Faz a **ponte entre a view e o model**. Controla o fluxo da aplicação, tratando eventos e chamadas da interface e delegando tarefas para os objetos do modelo ou DAO.

---

### 📦 `dao` (Data Access Object)
Contém as classes responsáveis por **acessar o banco de dados**. Cada DAO implementa os métodos de CRUD (inserir, buscar, atualizar, excluir), encapsulando as consultas SQL.

**Exemplo:** `UsuarioDAO.java`, `ProdutoDAO.java`.

---

### 📦 `persistencia`
Este pacote lida com a **conexão com o banco de dados**. Aqui você encontra a classe que configura a conexão via JDBC.

**Exemplo:** `Conexao.java` – gerencia a abertura e fechamento da conexão com o banco.

---

## ✅ Funcionalidades

- Criar registros no banco de dados
- Listar registros existentes
- Atualizar dados de registros
- Remover registros do sistema

---

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/XavierNTC/Projeto-CRUD-Java.git
