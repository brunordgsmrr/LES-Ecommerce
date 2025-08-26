describe('Teste de automação com cypress', () => {

  beforeEach(() => {
    cy.visit('http://localhost:5500/index.html');
  });

  it('passes', () => {
    cy.visit('http://localhost:5500/index.html')
    cy.get('#btn-novo-cliente').click().then(() => {
      cy.get('[name="nome"]').type('João da Silva');
      cy.get('[name="genero"]').select('Masculino');
      cy.get('[name="nascimento"]').type('1999-08-22');
      cy.get('[name="email"]').type('joao.silva@teste.com');
      cy.get('[name="senha"]').type('minhasenha123');
      cy.get('[name="tipo_endereco"]').type('Residencial');
      cy.get('[name="tipo_logradouro"]').type('Rua');
      cy.get('[name="logradouro"]').type('Rua das Maravilhas');
      cy.get('[name="numero"]').type('123');
      cy.get('[name="bairro"]').type('Jardim Revista');
      cy.get('[name="cidade"]').type('Suzano');
      cy.get('[name="estado"]').type('São Paulo');
      cy.get('[name="pais"]').type('Brasil');
    });


    const stub = cy.stub();

    cy.on('window:alert', stub)

    cy.get('#btn-cadastrar').click().then(() => {
      expect(stub).to.have.been.calledOnce;

      expect(stub.getCall(0)).to.be.calledWith('Cadastro realizado com sucesso!')
    })
  })
})

