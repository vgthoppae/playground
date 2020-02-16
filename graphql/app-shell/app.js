const express = require('express');
const app = express();
const { ApolloServer } = require('apollo-server-express');
const resolvers = require('./resolvers');
const typeDefs = require('./typedefs')
const model = require('./model');

const server = new ApolloServer({
  typeDefs,
  resolvers,
  context: {
    model
  }
});

server.applyMiddleware({ app });
app.listen(3000, () => console.log('Apollo Server is listening on port 3000'));
