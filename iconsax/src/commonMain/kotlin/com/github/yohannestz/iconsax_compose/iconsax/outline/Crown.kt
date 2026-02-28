package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Crown: ImageVector
    get() {
        val current = _crown
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Crown",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.0f, y = 21.04f)
                horizontalLineTo(x = 7.0f)
                arcToRelative(a = 5.76f, b = 5.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.75f, dy1 = -5.75f)
                verticalLineTo(y = 5.71f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.3f, dx2 = 0.6f, dy2 = -1.75f, dx3 = 0.96f, dy3 = -1.9f)
                reflectiveCurveToRelative(dx1 = 1.1f, dy1 = -0.26f, dx2 = 2.02f, dy2 = 0.66f)
                lineToRelative(dx = 2.59f, dy = 2.6f)
                arcToRelative(a = 0.24f, b = 0.24f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.35f, dy1 = 0.0f)
                lineToRelative(dx = 3.59f, dy = -3.6f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.47f, dy1 = 0.0f)
                lineToRelative(dx = 3.59f, dy = 3.6f)
                arcToRelative(a = 0.24f, b = 0.24f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.35f, dy1 = 0.0f)
                lineToRelative(dx = 2.59f, dy = -2.6f)
                curveToRelative(dx1 = 0.92f, dy1 = -0.92f, dx2 = 1.66f, dy2 = -0.8f, dx3 = 2.02f, dy3 = -0.66f)
                reflectiveCurveToRelative(dx1 = 0.96f, dy1 = 0.6f, dx2 = 0.96f, dy2 = 1.9f)
                verticalLineToRelative(dy = 9.6f)
                curveToRelative(dx1 = 0.01f, dy1 = 3.42f, dx2 = -2.3f, dy2 = 5.73f, dx3 = -5.74f, dy3 = 5.73f)
                moveTo(x = 2.81f, y = 5.24f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.06f, dy1 = 0.47f)
                verticalLineToRelative(dy = 9.6f)
                arcTo(horizontalEllipseRadius = 4.26f, verticalEllipseRadius = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.0f, y1 = 19.54f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 2.58f, dy1 = 0.0f, dx2 = 4.25f, dy2 = -1.67f, dx3 = 4.25f, dy3 = -4.25f)
                verticalLineTo(y = 5.71f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.06f, dy1 = -0.46f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.37f, dy1 = 0.3f)
                lineToRelative(dx = -2.59f, dy = 2.58f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.47f, dy1 = 0.0f)
                lineToRelative(dx = -3.59f, dy = -3.59f)
                arcToRelative(a = 0.24f, b = 0.24f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.35f, dy1 = 0.0f)
                lineTo(x = 8.24f, y = 8.12f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.47f, dy1 = 0.0f)
                lineTo(x = 3.18f, y = 5.53f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.37f, dy1 = -0.29f)
            }
        }.build().also { _crown = it }
    }

@Suppress("ObjectPropertyName")
private var _crown: ImageVector? = null
