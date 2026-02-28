package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LampOn: ImageVector
    get() {
        val current = _lampOn
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LampOn",
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
                moveTo(x = 19.21f, y = 6.36f)
                arcTo(horizontalEllipseRadius = 8.08f, verticalEllipseRadius = 8.08f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 6.98f, y1 = 3.78f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.01f, dy1 = 6.27f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.6f, dx2 = 1.55f, dy2 = 5.3f, dx3 = 3.89f, dy3 = 6.87f)
                verticalLineToRelative(dy = 0.83f)
                curveToRelative(dx1 = -0.01f, dy1 = 0.28f, dx2 = -0.02f, dy2 = 0.71f, dx3 = 0.32f, dy3 = 1.06f)
                reflectiveCurveToRelative(dx1 = 0.87f, dy1 = 0.4f, dx2 = 1.28f, dy2 = 0.4f)
                horizontalLineToRelative(dx = 5.13f)
                quadToRelative(dx1 = 0.81f, dy1 = 0.0f, dx2 = 1.23f, dy2 = -0.43f)
                curveToRelative(dx1 = 0.38f, dy1 = -0.39f, dx2 = 0.37f, dy2 = -0.89f, dx3 = 0.36f, dy3 = -1.16f)
                verticalLineToRelative(dy = -0.7f)
                curveToRelative(dx1 = 3.1f, dy1 = -2.09f, dx2 = 5.05f, dy2 = -6.5f, dx3 = 3.03f, dy3 = -10.56f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.26f, y = 22.0f)
                lineToRelative(dx = -0.19f, dy = -0.03f)
                arcToRelative(a = 11.0f, b = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -6.13f, dy1 = 0.0f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.86f, dy1 = -0.48f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.48f, dy1 = -0.86f)
                arcToRelative(a = 12.6f, b = 12.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.9f, dy1 = 0.0f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.48f, dy1 = 0.86f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.68f, dy1 = 0.5f)
            }
        }.build().also { _lampOn = it }
    }

@Suppress("ObjectPropertyName")
private var _lampOn: ImageVector? = null
