class ParkingSystem {
public:
    vector<int> cars;
    ParkingSystem(int big, int medium, int small) {
        cars.push_back(0);
        cars.push_back(big);
        cars.push_back(medium);
        cars.push_back(small);
    }
    
    bool addCar(int carType) {
        if (cars[carType] > 0){
            cars[carType]--;
            return true;
        }
        return false;
    }
};

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem* obj = new ParkingSystem(big, medium, small);
 * bool param_1 = obj->addCar(carType);
 */