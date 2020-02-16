const sequelize = require('./model/database.js')
const models = require('./model')

// console.log(user(sequelize, DataTypes))

const createData = async () => {
  await models.User.create({
    name: 'Julius Ortego',
    cars: [
      {
        make: 'Mercedes',
        model: 'ML350',
        color: 'Gray'
      }
    ]
  }, {
    include: [models.Car]
  })
  await models.User.create({
    name: 'Randy Hunt',
    cars: [
      {
        make: 'BMW',
        model: 'X5',
        color: 'Black'
      },
      {
        make: 'Lexus',
        model: 'RX350',
        color: 'Blue'
      }
    ]
  }, {
    include: [models.Car]
  })  
  await models.User.create({
    name: 'Kathy Couric',
    cars: [
      {
        make: 'Toyota',
        model: 'Corolla',
        color: 'Tan'
      },
      {
        make: 'Honda',
        model: 'Odyssey',
        color: 'Maroon'
      },
      {
        make: 'Tesla',
        model: 'M4',
        color: 'White'
      }      
    ]
  }, {
    include: [models.Car]
  })    
}

sequelize.sync().then(async () => {
  try {
    await createData();
    process.exit();
  } catch(error) {
    console.error(error)
  }
});


