package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Profile: ImageVector
    get() {
        val current = _profile
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Profile",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.16f, y = 11.62f)
                horizontalLineTo(x = 11.9f)
                arcToRelative(a = 5.17f, b = 5.17f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.1f, dy1 = -5.18f)
                arcToRelative(a = 5.2f, b = 5.2f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 5.39f, dy1 = 5.18f)
                close()
                moveTo(x = 12.0f, y = 2.75f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.7f, dy1 = 3.69f)
                arcToRelative(a = 3.66f, b = 3.66f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.88f, dy1 = 3.68f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.5f, dy1 = -3.68f)
                arcTo(horizontalEllipseRadius = 3.7f, verticalEllipseRadius = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 2.75f)
                moveToRelative(dx = 0.17f, dy = 19.8f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.42f, dy1 = -1.5f)
                curveTo(x1 = 5.36f, y1 = 20.13f, x2 = 4.6f, y2 = 18.87f, x3 = 4.6f, y3 = 17.5f)
                reflectiveCurveToRelative(dx1 = 0.76f, dy1 = -2.64f, dx2 = 2.15f, dy2 = -3.57f)
                curveToRelative(dx1 = 3.0f, dy1 = -1.99f, dx2 = 7.86f, dy2 = -1.99f, dx3 = 10.84f, dy3 = 0.0f)
                curveToRelative(dx1 = 1.38f, dy1 = 0.92f, dx2 = 2.15f, dy2 = 2.18f, dx3 = 2.15f, dy3 = 3.55f)
                reflectiveCurveToRelative(dx1 = -0.76f, dy1 = 2.64f, dx2 = -2.15f, dy2 = 3.57f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.42f, dy1 = 1.5f)
                moveToRelative(dx = -4.59f, dy = -7.36f)
                curveToRelative(dx1 = -0.96f, dy1 = 0.64f, dx2 = -1.48f, dy2 = 1.46f, dx3 = -1.48f, dy3 = 2.32f)
                reflectiveCurveToRelative(dx1 = 0.53f, dy1 = 1.67f, dx2 = 1.48f, dy2 = 2.3f)
                curveToRelative(dx1 = 2.5f, dy1 = 1.67f, dx2 = 6.7f, dy2 = 1.67f, dx3 = 9.18f, dy3 = 0.0f)
                curveToRelative(dx1 = 0.96f, dy1 = -0.64f, dx2 = 1.48f, dy2 = -1.46f, dx3 = 1.48f, dy3 = -2.32f)
                reflectiveCurveToRelative(dx1 = -0.53f, dy1 = -1.67f, dx2 = -1.48f, dy2 = -2.3f)
                curveToRelative(dx1 = -2.49f, dy1 = -1.66f, dx2 = -6.69f, dy2 = -1.66f, dx3 = -9.18f, dy3 = 0.0f)
            }
        }.build().also { _profile = it }
    }

@Suppress("ObjectPropertyName")
private var _profile: ImageVector? = null
