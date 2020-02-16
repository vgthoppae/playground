const Sequelize = require('sequelize');
const sequelize = new Sequelize('mysql://root:password@graphql-instance.cgu55l1gmfys.us-east-1.rds.amazonaws.com:3306/graphql', {
    operatorsAliases: false,
    dialect: 'mysql',
    define: {
        timestamps: false
    }
})
module.exports = sequelize;