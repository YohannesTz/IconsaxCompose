package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SecurityUser: ImageVector
    get() {
        val current = _securityUser
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SecurityUser",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.5f, y = 4.11f)
                lineToRelative(dx = -4.99f, dy = -1.87f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.02f, dy1 = 0.0f)
                lineTo(x = 5.5f, y = 4.11f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.09f, dy1 = 3.01f)
                verticalLineToRelative(dy = 7.43f)
                arcToRelative(a = 4.9f, b = 4.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.73f, dy1 = 3.44f)
                lineToRelative(dx = 4.3f, dy = 3.21f)
                arcToRelative(a = 4.55f, b = 4.55f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.14f, dy1 = 0.0f)
                lineToRelative(dx = 4.3f, dy = -3.21f)
                arcToRelative(a = 4.9f, b = 4.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.73f, dy1 = -3.44f)
                verticalLineTo(y = 7.12f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.11f, dy1 = -3.01f)
                moveToRelative(dx = -6.57f, dy = 2.92f)
                arcToRelative(a = 2.14f, b = 2.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.14f, dy1 = 2.14f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.06f, dy1 = 2.13f)
                horizontalLineToRelative(dx = -0.1f)
                arcToRelative(a = 2.13f, b = 2.13f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.1f, dy1 = -2.13f)
                arcToRelative(a = 2.13f, b = 2.13f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.12f, dy1 = -2.14f)
                moveToRelative(dx = 2.26f, dy = 9.33f)
                curveToRelative(dx1 = -0.61f, dy1 = 0.4f, dx2 = -1.4f, dy2 = 0.61f, dx3 = -2.19f, dy3 = 0.61f)
                reflectiveCurveToRelative(dx1 = -1.59f, dy1 = -0.2f, dx2 = -2.19f, dy2 = -0.61f)
                curveToRelative(dx1 = -0.57f, dy1 = -0.38f, dx2 = -0.88f, dy2 = -0.9f, dx3 = -0.89f, dy3 = -1.47f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.56f, dx2 = 0.32f, dy2 = -1.1f, dx3 = 0.89f, dy3 = -1.48f)
                arcToRelative(a = 4.3f, b = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.39f, dy1 = 0.0f)
                curveToRelative(dx1 = 0.57f, dy1 = 0.38f, dx2 = 0.89f, dy2 = 0.9f, dx3 = 0.89f, dy3 = 1.47f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.9f, dy1 = 1.48f)
            }
        }.build().also { _securityUser = it }
    }

@Suppress("ObjectPropertyName")
private var _securityUser: ImageVector? = null
