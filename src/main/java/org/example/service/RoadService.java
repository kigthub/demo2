package org.example.service;

import org.example.pojo.Road;
import org.example.util.SqlUtils;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RoadService {

    private final SqlUtils sqlUtils = new SqlUtils();


    public List<Road> selectAll() throws SQLException, ClassNotFoundException {
        List<Road> list = new ArrayList<>();

        String sql = "select * from road";

        Connection connection = sqlUtils.getConnection();
        PreparedStatement prepareStatement = connection.prepareStatement(sql);
        ResultSet resultSet = prepareStatement.executeQuery();

        while (resultSet.next()) {
            Road road = new Road();
            road.setId(resultSet.getInt(1));
            road.setMoney(resultSet.getInt(2));
            road.setRoadHaul(resultSet.getInt(3));

            list.add(road);
        }

        resultSet.close();
        connection.close();
        prepareStatement.close();

        return list;
    }


    public Road selectById(int id) throws SQLException, ClassNotFoundException {
        Road road = new Road();

        String sql = "select * from road where car_id = ?";

        Connection connection = sqlUtils.getConnection();
        PreparedStatement prepareStatement = connection.prepareStatement(sql);
        prepareStatement.setInt(1, id);
        ResultSet resultSet = prepareStatement.executeQuery();

        while (resultSet.next()) {
            road.setId(resultSet.getInt(1));
            road.setMoney(resultSet.getInt(2));
            road.setRoadHaul(resultSet.getInt(3));
        }

        resultSet.close();
        connection.close();
        prepareStatement.close();

        return road;
    }

    public void add(Road road) throws SQLException, ClassNotFoundException {

        String sql = "insert into road values (?,?,?)";

        Connection connection = sqlUtils.getConnection();
        PreparedStatement prepareStatement = connection.prepareStatement(sql);
        prepareStatement.setInt(1, road.getId());
        prepareStatement.setInt(2, road.getMoney());
        prepareStatement.setInt(3, road.getRoadHaul());
        prepareStatement.executeUpdate();

        connection.close();
        prepareStatement.close();
    }

    public void update(Road road) throws SQLException, ClassNotFoundException {

        String sql = "update road set money = ?, road_haul = ? where car_id = ?";

        Connection connection = sqlUtils.getConnection();
        PreparedStatement prepareStatement = connection.prepareStatement(sql);
        prepareStatement.setInt(1, road.getMoney());
        prepareStatement.setInt(2, road.getRoadHaul());
        prepareStatement.setInt(3, road.getId());
        prepareStatement.executeUpdate();

        connection.close();
        prepareStatement.close();
    }

    public void delete(int id) throws SQLException, ClassNotFoundException {

        String sql = "delete from road WHERE car_id = ?";

        Connection connection = sqlUtils.getConnection();
        PreparedStatement prepareStatement = connection.prepareStatement(sql);
        prepareStatement.setInt(1, id);
        prepareStatement.executeUpdate();

        connection.close();
        prepareStatement.close();
    }
}

