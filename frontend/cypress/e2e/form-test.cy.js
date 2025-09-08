describe('Teste de cadastro de cliente', () => {

  beforeEach(() => {
    cy.visit('http://localhost:5500/page/cadastro-cliente');
  });

  it('passes', () => {

    let cpfRandon = Number(Math.random() * 10000000000)
    cy.get('[name="nome"]').type('João da Silva');
    cy.get('[name="cpf"]').type(cpfRandon);
    cy.get('[name="genero"]').select('Masculino');
    cy.get('[name="nascimento"]').type('1999-08-22');
    cy.get('[name="email"]').type(`${cpfRandon}@gmail.com`);
    cy.get('[name="telefone"]').type('11222223333');
    cy.get('[name="tipo_telefone"]').type('Pessoal');
    cy.get('[name="tipo_residencia"]').type('Casa');
    cy.get('[name="tipo_logradouro"]').type('Rua');
    cy.get('[name="logradouro"]').type('Rua das Maravilhas');
    cy.get('[name="numero"]').type('123');
    cy.get('[name="cep"]').type('11111222');
    cy.get('[name="bairro"]').type('Jardim Revista');
    cy.get('[name="cidade"]').type('Suzano');
    cy.get('[name="estado"]').type('São Paulo');
    cy.get('[name="pais"]').type('Brasil');
    cy.get('[name="senha"]').type('minhasenha123');
    cy.get('[name="re-senha"]').type('minhasenha123');
  })

})