const { gql } = require('apollo-server-express');

const carTypeDefs = gql`
  extend type Query {
    cars: [Car]
    car(id: Int): Car
  }
  type Car {
    id: Int
    make: String
    model: String
    color: String
    price: Int
    owner: User
  }
  extend type Mutation {
    createCar(make: String!, model: String!, color: String!, user: User!): Car!
    removeCar(id: Int!): Boolean!
  }
`;

module.exports = carTypeDefs;