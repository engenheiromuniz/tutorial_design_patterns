# 🧩 Padrões de Projeto

![Categorias](https://img.shields.io/badge/categorias-3-blue?style=for-the-badge)
![Criacionais](https://img.shields.io/badge/Criacionais-Criar_objetos-2e8b57?style=for-the-badge)
![Estruturais](https://img.shields.io/badge/Estruturais-Organizar_classes-d97706?style=for-the-badge)
![Comportamentais](https://img.shields.io/badge/Comportamentais-Comunicar_objetos-7c3aed?style=for-the-badge)

> **Padrões de projeto** (*design patterns*) são soluções já pensadas e exaustivamente validadas por desenvolvedores de software para problemas que se repetem no design de sistemas.

---

## 🗂️ As 3 categorias

Existem **3 categorias** básicas de padrões de projeto:

```mermaid
graph TD
    P([🧩 Padrões de Projeto])
    P --> C1[🏭 Criacionais]
    P --> C2[🧱 Estruturais]
    P --> C3[💬 Comportamentais]

    C1 --> A1[Singleton]
    C1 --> A2[Factory Method]
    C1 --> A3[Abstract Factory]
    C1 --> A4[Builder]
    C1 --> A5[Prototype]

    C2 --> B1[Adapter]
    C2 --> B2[Facade]
    C2 --> B3[Decorator]
    C2 --> B4[Proxy]
    C2 --> B5[Bridge]
    C2 --> B6[Composite]

    C3 --> D1[Observer]
    C3 --> D2[Strategy]
    C3 --> D3[Chain of Responsibility]

    classDef cri fill:#d1fae5,stroke:#2e8b57,color:#000
    classDef est fill:#fef3c7,stroke:#d97706,color:#000
    classDef com fill:#ede9fe,stroke:#7c3aed,color:#000
    class C1,A1,A2,A3,A4,A5 cri
    class C2,B1,B2,B3,B4,B5,B6 est
    class C3,D1,D2,D3 com
```

| Categoria | Ligada a... | Exemplos |
|:--|:--|:--|
| 🏭 **Criacionais** | Controle e criação de objetos | Singleton, Factory Method, Abstract Factory, Builder, Prototype |
| 🧱 **Estruturais** | Estruturação entre objetos e classes | Adapter, Facade, Decorator, Proxy, Bridge, Composite |
| 💬 **Comportamentais** | Comunicação entre objetos e distribuição de responsabilidades | Observer, Strategy, Chain of Responsibility |

---

## ✅ Quando utilizar

### 🏭 Criacionais: o exemplo do Singleton

- 🗄️ **Conexão com o banco de dados**: restringimos a porta de entrada para o banco a uma única instância (ou a um único *pool* de conexões), evitando conexões soltas pelo sistema.
- 📝 **Gestão de logs**: com um único ponto de registro, todas as mensagens passam pelo mesmo lugar. Não há instâncias perdidas ou desconhecidas, e os logs ficam centralizados e fáceis de acompanhar.

### 🧱 Estruturais: os exemplos de Adapter e Facade

- 🔌 Quando o **mesmo sistema precisa ser acessado por interfaces diferentes**, ou precisa atender dispositivos e clientes distintos sem que o seu núcleo seja alterado.
  - **Adapter**: traduz uma interface para a que o outro lado espera.
  - **Facade**: oferece uma porta de entrada simples para um conjunto de classes complexas.

### 💬 Comportamentais: os exemplos de Observer e Strategy

- 🔔 **Observer**: quando precisamos ser **avisados automaticamente** se algo mudar na aplicação, em situações previamente mapeadas. Exemplo: enviar uma mensagem quando um evento acontece.
- 💳 **Strategy**: quando temos **diferentes meios de pagamento** para a compra de um produto (Pix, cartão, boleto) e queremos escolher entre eles sem encher o código de `if/else`.

> [!NOTE]
> No Observer, ninguém precisa ficar "escaneando" a aplicação o tempo todo. Quem tem interesse se **inscreve** e é **notificado** quando a mudança acontece.

### 📌 Resumo rápido

| Situação | Categoria | Padrão |
|:--|:--:|:--:|
| Uma única porta de entrada para o banco de dados | 🏭 | Singleton |
| Gestão centralizada de logs | 🏭 | Singleton |
| Mesmo sistema acessado por interfaces diferentes | 🧱 | Adapter |
| Avisar quando uma mudança mapeada acontecer | 💬 | Observer |
| Vários meios de pagamento para uma compra | 💬 | Strategy |

---

## ⛔ Quando NÃO utilizar

> [!WARNING]
> O padrão **não é o fim**, e sim o **meio** para alcançar um bom design de software. Se utilizá-lo torna a execução mais difícil ou faz pouca diferença, **não faz sentido usá-lo**.