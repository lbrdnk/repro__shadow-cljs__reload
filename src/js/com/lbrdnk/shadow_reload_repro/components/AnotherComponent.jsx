import { View, Text } from "react-native";

export function AnotherComponent(props) {
    return (
        <View style={{
            margin: 2, padding: 2, borderWidth: 2,
            flex: 1, justifyContent: "center", alignItems: "center"
        }}>
            <Text>AnotherComponent</Text>
        </View>
    )
}