package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CoinOne: ImageVector
    get() {
        val current = _coinOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CoinOne",
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
                moveTo(x = 9.99f, y = 17.98f)
                arcTo(horizontalEllipseRadius = 7.99f, verticalEllipseRadius = 7.99f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, x1 = 9.99f, y1 = 2.0f)
                arcToRelative(a = 7.99f, b = 7.99f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 15.98f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.97f, y = 15.99f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.3f, dx2 = -2.68f, dy2 = 5.98f, dx3 = -5.98f, dy3 = 5.98f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.91f, dy1 = -2.57f)
                arcToRelative(a = 9.46f, b = 9.46f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 8.32f, dy1 = -8.32f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.57f, dy1 = 4.9f)
                moveTo(x = 11.45f, y = 9.7f)
                lineToRelative(dx = -2.4f, dy = -0.84f)
                curveToRelative(dx1 = -0.24f, dy1 = -0.08f, dx2 = -0.29f, dy2 = -0.1f, dx3 = -0.29f, dy3 = -0.45f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.26f, dx2 = 0.18f, dy2 = -0.47f, dx3 = 0.41f, dy3 = -0.47f)
                horizontalLineToRelative(dx = 1.5f)
                curveToRelative(dx1 = 0.32f, dy1 = 0.0f, dx2 = 0.58f, dy2 = 0.29f, dx3 = 0.58f, dy3 = 0.65f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = 0.34f, dy2 = 0.75f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = -0.34f, dx2 = 0.75f, dy2 = -0.75f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.0f, dy1 = -2.14f)
                verticalLineTo(y = 6.41f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -1.5f, dy1 = 0.0f)
                verticalLineToRelative(dy = 0.05f)
                horizontalLineTo(x = 9.16f)
                arcToRelative(a = 1.94f, b = 1.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.91f, dy1 = 1.97f)
                quadToRelative(dx1 = 0.0f, dy1 = 1.42f, dx2 = 1.29f, dy2 = 1.86f)
                lineToRelative(dx = 2.41f, dy = 0.84f)
                curveToRelative(dx1 = 0.24f, dy1 = 0.08f, dx2 = 0.29f, dy2 = 0.1f, dx3 = 0.29f, dy3 = 0.45f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.26f, dx2 = -0.18f, dy2 = 0.47f, dx3 = -0.41f, dy3 = 0.47f)
                horizontalLineToRelative(dx = -1.5f)
                curveToRelative(dx1 = -0.32f, dy1 = 0.0f, dx2 = -0.58f, dy2 = -0.29f, dx3 = -0.58f, dy3 = -0.65f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = -0.34f, dy2 = -0.75f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = 0.34f, dx2 = -0.75f, dy2 = 0.75f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.0f, dy1 = 2.14f)
                verticalLineToRelative(dy = 0.06f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = 0.34f, dy2 = 0.75f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = -0.34f, dx2 = 0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -0.05f)
                horizontalLineToRelative(dx = 0.09f)
                arcToRelative(a = 1.94f, b = 1.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.91f, dy1 = -1.97f)
                quadToRelative(dx1 = 0.0f, dy1 = -1.42f, dx2 = -1.3f, dy2 = -1.87f)
            }
        }.build().also { _coinOne = it }
    }

@Suppress("ObjectPropertyName")
private var _coinOne: ImageVector? = null
