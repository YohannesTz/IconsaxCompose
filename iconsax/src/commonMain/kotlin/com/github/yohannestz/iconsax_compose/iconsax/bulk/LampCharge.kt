package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LampCharge: ImageVector
    get() {
        val current = _lampCharge
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LampCharge",
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
                moveTo(x = 12.0f, y = 13.85f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.65f, dy1 = -1.12f)
                lineToRelative(dx = 0.85f, dy = -1.48f)
                horizontalLineToRelative(dx = -0.84f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.13f, dy1 = -0.59f)
                curveToRelative(dx1 = -0.22f, dy1 = -0.38f, dx2 = -0.2f, dy2 = -0.84f, dx3 = 0.05f, dy3 = -1.28f)
                lineToRelative(dx = 1.07f, dy = -1.86f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.02f, dy1 = -0.28f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.28f, dy1 = 1.02f)
                lineTo(x = 11.8f, y = 9.75f)
                horizontalLineToRelative(dx = 0.84f)
                curveToRelative(dx1 = 0.5f, dy1 = 0.0f, dx2 = 0.91f, dy2 = 0.22f, dx3 = 1.13f, dy3 = 0.59f)
                curveToRelative(dx1 = 0.22f, dy1 = 0.38f, dx2 = 0.2f, dy2 = 0.84f, dx3 = -0.05f, dy3 = 1.28f)
                lineToRelative(dx = -1.07f, dy = 1.86f)
                arcTo(horizontalEllipseRadius = 0.8f, verticalEllipseRadius = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 13.85f)
            }
        }.build().also { _lampCharge = it }
    }

@Suppress("ObjectPropertyName")
private var _lampCharge: ImageVector? = null
