package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 10.49f, y = 2.23f)
                lineTo(x = 5.5f, y = 4.1f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.09f, dy1 = 3.02f)
                verticalLineToRelative(dy = 7.43f)
                arcToRelative(a = 4.9f, b = 4.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.73f, dy1 = 3.44f)
                lineToRelative(dx = 4.3f, dy = 3.2f)
                arcToRelative(a = 4.55f, b = 4.55f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.14f, dy1 = 0.0f)
                lineToRelative(dx = 4.3f, dy = -3.2f)
                arcToRelative(a = 4.9f, b = 4.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.73f, dy1 = -3.44f)
                verticalLineTo(y = 7.12f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.09f, dy1 = -3.02f)
                lineToRelative(dx = -4.99f, dy = -1.87f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.04f, dy1 = 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.9f, y = 11.3f)
                horizontalLineTo(x = 12.0f)
                arcToRelative(a = 2.13f, b = 2.13f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.08f, dy1 = -4.27f)
                arcToRelative(a = 2.14f, b = 2.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.14f, dy1 = 2.14f)
                arcToRelative(a = 2.16f, b = 2.16f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.12f, dy1 = 2.13f)
                moveToRelative(dx = 2.29f, dy = 2.11f)
                arcToRelative(a = 4.3f, b = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.39f, dy1 = 0.0f)
                curveToRelative(dx1 = -0.56f, dy1 = 0.38f, dx2 = -0.89f, dy2 = 0.92f, dx3 = -0.89f, dy3 = 1.48f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.57f, dx2 = 0.32f, dy2 = 1.1f, dx3 = 0.89f, dy3 = 1.47f)
                curveToRelative(dx1 = 0.61f, dy1 = 0.4f, dx2 = 1.4f, dy2 = 0.61f, dx3 = 2.19f, dy3 = 0.61f)
                reflectiveCurveToRelative(dx1 = 1.59f, dy1 = -0.2f, dx2 = 2.19f, dy2 = -0.6f)
                curveToRelative(dx1 = 0.56f, dy1 = -0.39f, dx2 = 0.89f, dy2 = -0.93f, dx3 = 0.89f, dy3 = -1.49f)
                curveToRelative(dx1 = 0.01f, dy1 = -0.57f, dx2 = -0.31f, dy2 = -1.09f, dx3 = -0.88f, dy3 = -1.47f)
            }
        }.build().also { _securityUser = it }
    }

@Suppress("ObjectPropertyName")
private var _securityUser: ImageVector? = null
