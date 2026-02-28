package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudAdd: ImageVector
    get() {
        val current = _cloudAdd
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CloudAdd",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 11.53f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.27f, dy1 = 7.57f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 21.53f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.54f, dy1 = -2.94f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 11.53f)
                moveToRelative(dx = 2.07f, dy = 4.57f)
                lineToRelative(dx = -2.13f, dy = 1.97f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.51f, dy1 = 0.2f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                lineToRelative(dx = -0.99f, dy = -0.99f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                lineToRelative(dx = 0.48f, dy = 0.48f)
                lineToRelative(dx = 1.6f, dy = -1.48f)
                curveToRelative(dx1 = 0.31f, dy1 = -0.28f, dx2 = 0.78f, dy2 = -0.26f, dx3 = 1.06f, dy3 = 0.04f)
                reflectiveCurveToRelative(dx1 = 0.26f, dy1 = 0.77f, dx2 = -0.04f, dy2 = 1.06f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.2f, y = 17.07f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.17f, dy1 = 0.81f)
                curveToRelative(dx1 = -0.36f, dy1 = 0.18f, dx2 = -0.72f, dy2 = -0.17f, dx3 = -0.66f, dy3 = -0.57f)
                arcToRelative(a = 6.51f, b = 6.51f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -6.44f, dy1 = -7.4f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -6.36f, dy1 = 7.83f)
                curveToRelative(dx1 = 0.07f, dy1 = 0.35f, dx2 = -0.2f, dy2 = 0.7f, dx3 = -0.55f, dy3 = 0.61f)
                curveTo(x1 = 1.07f, y1 = 17.4f, x2 = 1.05f, y2 = 11.31f, x3 = 5.47f, y3 = 11.0f)
                horizontalLineToRelative(dx = 0.05f)
                curveTo(x1 = 2.31f, y1 = 2.07f, x2 = 15.85f, y2 = -1.5f, x3 = 17.4f, y3 = 7.88f)
                curveToRelative(dx1 = 4.33f, dy1 = 0.55f, dx2 = 6.08f, dy2 = 6.32f, dx3 = 2.8f, dy3 = 9.2f)
            }
        }.build().also { _cloudAdd = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudAdd: ImageVector? = null
