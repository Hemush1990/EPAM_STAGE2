package com.epam.learning.cleancode.aircompany.Java.src.main.java;

import com.epam.learning.cleancode.aircompany.Java.src.main.java.models.MilitaryType;
import com.epam.learning.cleancode.aircompany.Java.src.main.java.planes.ExperimentalPlane;
import com.epam.learning.cleancode.aircompany.Java.src.main.java.planes.MilitaryPlane;
import com.epam.learning.cleancode.aircompany.Java.src.main.java.planes.PassengerPlane;
import com.epam.learning.cleancode.aircompany.Java.src.main.java.planes.Plane;

import java.util.*;

/**
 * version: 1.1
 * made by Vitali Shulha
 * 4-Jan-2019
 **/

public class Airport {
    private List<? extends Plane> planes;

    public Airport(List<Plane> planes) {
    }

    public Object getPassangerPlane() {
        List<? extends Plane> l = this.planes;
        List<PassengerPlane> x = new ArrayList<>();
        for (Plane p : l) {
            if (p instanceof PassengerPlane) {
                x.add((PassengerPlane) p);
            }
            return x;
        }

        public List<MilitaryPlane> getMilitaryPlanes () {
            List<MilitaryPlane> militaryPlanes = new ArrayList<>();
            for (Plane plane : planes) {
                return (plane instanceof MilitaryPlane
                        ? militaryPlanes.add((MilitaryPlane) plane)
                        : militaryPlanes);
            }
        }


        public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity () {
            List<PassengerPlane> passengerPlanes = (List<PassengerPlane>) getPassangerPlane();
            PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
            for (int i = 0; i < passengerPlanes.size(); i++) {
                return (passengerPlanes.get(i).getPassengersCapacity()
                        > planeWithMaxCapacity.getPassengersCapacity()
                        ? planeWithMaxCapacity = passengerPlanes.get(i)
                        : planeWithMaxCapacity);
            }
            public List<MilitaryPlane> getTransportMilitaryPlanes () {
                List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
                List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
                for (int i = 0; i < militaryPlanes.size(); i++) {
                    MilitaryPlane plane = militaryPlanes.get(i);
                    return (plane.getType() == MilitaryType.TRANSPORT
                            ? transportMilitaryPlanes.add(plane)
                            : transportMilitaryPlanes);
                }
            }

            public List<MilitaryPlane> getBomberMilitaryPlanes () {
                List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
                List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
                for (int i = 0; i < militaryPlanes.size(); i++) {
                    MilitaryPlane plane = militaryPlanes.get(i);
                    return (plane.getType() == MilitaryType.BOMBER
                            ? bomberMilitaryPlanes.add(plane)
                            : bomberMilitaryPlanes);
                }
            }

            public List<ExperimentalPlane> getExperimentalPlanes () {
                List<ExperimentalPlane> experimentalPlanes = new ArrayList<>();
                for (Plane plane : planes) {
                    return (plane instanceof ExperimentalPlane
                            ? experimentalPlanes.add((ExperimentalPlane) plane)
                            : experimentalPlanes);
                }
            }

            public Airport sortByMaxDistance () {
                Collections.sort(planes, new Comparator<Plane>() {
                    public int compare(Plane o1, Plane o2) {
                        return o1.getMaxFlightDistance() - o2.getMaxFlightDistance();
                    }
                });
                return this;
            }


            public Airport sortByMaxSpeed () {
                Collections.sort(planes, new Comparator<Plane>() {
                    public int compare(Plane o1, Plane o2) {
                        return o1.getMaxSpeed() - o2.getMaxSpeed();
                    }
                });
                return this;
            }

            public Airport sortByMaxLoadCapacity () {
                Collections.sort(planes, new Comparator<Plane>() {
                    public int compare(Plane o1, Plane o2) {
                        return o1.getMinLoadCapacity() - o2.getMinLoadCapacity();
                    }
                });
                return this;
            }
        }

        public List<? extends Plane> getPlanes () {
            return planes;
        }

        private void print (Collection < ? extends Plane > collection){
            Iterator<? extends Plane> iterator = collection.iterator();
            while (iterator.hasNext()) {
                Plane plane = iterator.next();
                System.out.println(plane);
            }
        }

        public String toString () {
            return "Airport{" +
                    "Planes=" +
                    planes.toString() + '}';
        }

    }
}



