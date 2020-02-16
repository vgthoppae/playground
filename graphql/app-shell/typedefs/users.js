const { gql } = require('apollo-server-express');

const userTypeDefs = gql`
  extend type Query {
    users: [User]
    user(id: Int): User
    me: User
  }
  type User {
    id: Int
    name: String!
    cars: [Car]
  }
  extend type Mutation {
    createUser(name: String!): User!
    removeUser(id: Int!): Boolean!
  }
`;

module.exports = userTypeDefs;