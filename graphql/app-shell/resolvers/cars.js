
const resolvers = {
    Query: {
      cars: (parent, args, context, info) => context.model.Car.findAll(),
      car: (parent, args, context, info) => {
        return context.model.Car.findByPk(args.id);
      }
    },
    Mutation: {
      createCar: (parent, { make, model, color, User }, context, info) => {
        return context.model.Car.create({
          make: make,
          model: model,
          color: color,
          User: User
        })
      },
      removeCar: (parent, { id }, context, info) => {
        let found = false;
        context.model.cars = context.model.cars.filter(u => {
          if (u.id != id) {
            return u;
          } else {
            found = true;
          }
        });
        return found;
      }
    },
    Car: {
      owner: (parent, args, context, info) => context.model.User.findByPk(parent.userId)
    }
  };

  module.exports = resolvers;