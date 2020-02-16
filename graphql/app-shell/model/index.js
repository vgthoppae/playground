const sequelize = require('./database')

const UserModel = sequelize.import('./users')
const CarModel = sequelize.import('./cars')

const models = {
  User: UserModel,
  Car: CarModel
}

Object.keys(models).forEach(key => {
  if ('associate' in models[key]) {
    models[key].associate(models);
  }
});

module.exports = models;