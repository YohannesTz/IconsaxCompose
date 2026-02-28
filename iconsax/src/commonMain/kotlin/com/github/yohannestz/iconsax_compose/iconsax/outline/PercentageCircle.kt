package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PercentageCircle: ImageVector
    get() {
        val current = _percentageCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.PercentageCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.57f, y = 16.02f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                lineToRelative(dx = 6.55f, dy = -6.55f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                lineTo(x = 9.1f, y = 15.8f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = 0.22f)
                moveToRelative(dx = 0.41f, dy = -4.91f)
                arcToRelative(a = 1.98f, b = 1.98f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -3.96f)
                arcToRelative(a = 1.98f, b = 1.98f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 3.96f)
                moveToRelative(dx = 0.0f, dy = -2.45f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 8.5f, y1 = 9.14f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.27f, dx2 = 0.21f, dy2 = 0.48f, dx3 = 0.48f, dy3 = 0.48f)
                reflectiveCurveTo(x1 = 9.46f, y1 = 9.4f, x2 = 9.46f, y2 = 9.14f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.48f, dy1 = -0.48f)
                moveToRelative(dx = 6.54f, dy = 8.18f)
                arcToRelative(a = 1.98f, b = 1.98f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -3.96f)
                arcToRelative(a = 1.98f, b = 1.98f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 3.96f)
                moveToRelative(dx = 0.0f, dy = -2.45f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.48f, dy1 = 0.48f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.27f, dx2 = 0.2f, dy2 = 0.48f, dx3 = 0.48f, dy3 = 0.48f)
                reflectiveCurveTo(x1 = 16.0f, y1 = 15.14f, x2 = 16.0f, y2 = 14.87f)
                reflectiveCurveToRelative(dx1 = -0.21f, dy1 = -0.48f, dx2 = -0.48f, dy2 = -0.48f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -21.5f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 21.5f)
                moveToRelative(dx = 0.0f, dy = -20.0f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 18.5f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -18.5f)
            }
        }.build().also { _percentageCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _percentageCircle: ImageVector? = null
