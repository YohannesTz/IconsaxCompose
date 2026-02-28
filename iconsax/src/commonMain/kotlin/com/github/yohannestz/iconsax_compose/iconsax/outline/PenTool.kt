package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PenTool: ImageVector
    get() {
        val current = _penTool
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.PenTool",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.27f, y = 23.25f)
                horizontalLineToRelative(dx = -2.52f)
                curveToRelative(dx1 = -0.7f, dy1 = 0.0f, dx2 = -1.33f, dy2 = -0.3f, dx3 = -1.75f, dy3 = -0.8f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.38f, dy1 = -1.62f)
                lineToRelative(dx = 0.41f, dy = -1.8f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.73f, dy1 = -0.59f)
                horizontalLineToRelative(dx = 4.5f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.73f, dy1 = 0.58f)
                lineToRelative(dx = 0.41f, dy = 1.81f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.36f, dy1 = 1.64f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.77f, dy1 = 0.78f)
                moveToRelative(dx = -2.91f, dy = -3.33f)
                lineToRelative(dx = -0.28f, dy = 1.23f)
                arcToRelative(a = 0.4f, b = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.09f, dy1 = 0.34f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.58f, dy1 = 0.25f)
                horizontalLineToRelative(dx = 2.52f)
                quadToRelative(dx1 = 0.4f, dy1 = 0.0f, dx2 = 0.6f, dy2 = -0.23f)
                quadToRelative(dx1 = 0.12f, dy1 = -0.15f, dx2 = 0.07f, dy2 = -0.37f)
                lineToRelative(dx = -0.28f, dy = -1.23f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.26f, y = 19.92f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.56f, dy1 = -0.25f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.06f, dy1 = -1.06f)
                lineToRelative(dx = 1.73f, dy = -1.54f)
                curveToRelative(dx1 = 0.69f, dy1 = -0.61f, dx2 = 0.66f, dy2 = -0.76f, dx3 = 0.15f, dy3 = -1.4f)
                lineToRelative(dx = -3.05f, dy = -3.87f)
                quadToRelative(dx1 = -0.26f, dy1 = -0.32f, dx2 = -0.58f, dy2 = -0.33f)
                quadToRelative(dx1 = -0.32f, dy1 = 0.0f, dx2 = -0.58f, dy2 = 0.33f)
                lineToRelative(dx = -3.05f, dy = 3.87f)
                curveToRelative(dx1 = -0.54f, dy1 = 0.69f, dx2 = -0.53f, dy2 = 0.84f, dx3 = 0.13f, dy3 = 1.38f)
                lineToRelative(dx = 1.75f, dy = 1.56f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.06f, dy1 = 1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.06f, dy1 = 0.06f)
                lineToRelative(dx = -1.73f, dy = -1.54f)
                curveToRelative(dx1 = -1.26f, dy1 = -1.03f, dx2 = -1.37f, dy2 = -2.13f, dx3 = -0.33f, dy3 = -3.45f)
                lineToRelative(dx = 3.05f, dy = -3.87f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.76f, dy1 = -0.9f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.76f, dy1 = 0.9f)
                lineToRelative(dx = 3.05f, dy = 3.87f)
                curveToRelative(dx1 = 1.03f, dy1 = 1.3f, dx2 = 0.93f, dy2 = 2.34f, dx3 = -0.33f, dy3 = 3.45f)
                lineToRelative(dx = -1.73f, dy = 1.54f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.5f, dy1 = 0.19f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.01f, y = 14.4f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineToRelative(dy = -2.53f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.4f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 2.53f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                moveTo(x = 12.0f, y = 6.3f)
                curveToRelative(dx1 = -0.5f, dy1 = 0.0f, dx2 = -1.0f, dy2 = -0.2f, dx3 = -1.38f, dy3 = -0.57f)
                lineTo(x = 9.84f, y = 4.94f)
                arcToRelative(a = 1.96f, b = 1.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -2.76f)
                lineToRelative(dx = 0.78f, dy = -0.78f)
                arcToRelative(a = 1.96f, b = 1.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.76f, dy1 = 0.0f)
                lineToRelative(dx = 0.78f, dy = 0.78f)
                arcToRelative(a = 1.96f, b = 1.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 2.76f)
                lineToRelative(dx = -0.78f, dy = 0.78f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 6.29f)
                moveToRelative(dx = 0.0f, dy = -3.96f)
                arcToRelative(a = 0.4f, b = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.32f, dy1 = 0.13f)
                lineTo(x = 10.9f, y = 3.24f)
                quadToRelative(dx1 = -0.12f, dy1 = 0.13f, dx2 = -0.13f, dy2 = 0.32f)
                curveToRelative(dx1 = -0.01f, dy1 = 0.19f, dx2 = 0.05f, dy2 = 0.23f, dx3 = 0.13f, dy3 = 0.32f)
                lineToRelative(dx = 0.78f, dy = 0.78f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.64f, dy1 = 0.0f)
                lineToRelative(dx = 0.78f, dy = -0.78f)
                quadToRelative(dx1 = 0.12f, dy1 = -0.13f, dx2 = 0.13f, dy2 = -0.32f)
                curveToRelative(dx1 = 0.01f, dy1 = -0.2f, dx2 = -0.05f, dy2 = -0.23f, dx3 = -0.13f, dy3 = -0.32f)
                lineToRelative(dx = -0.78f, dy = -0.78f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 2.33f)
                moveToRelative(dx = 8.55f, dy = 11.73f)
                horizontalLineToRelative(dx = -1.1f)
                arcToRelative(a = 1.95f, b = 1.95f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.95f, dy1 = -1.95f)
                verticalLineTo(y = 11.0f)
                arcToRelative(a = 1.95f, b = 1.95f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.95f, dy1 = -1.95f)
                horizontalLineToRelative(dx = 1.1f)
                arcTo(horizontalEllipseRadius = 1.95f, verticalEllipseRadius = 1.95f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.5f, y1 = 11.0f)
                verticalLineToRelative(dy = 1.1f)
                arcToRelative(a = 1.95f, b = 1.95f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.95f, dy1 = 1.95f)
                moveToRelative(dx = -1.1f, dy = -3.5f)
                arcTo(horizontalEllipseRadius = 0.45f, verticalEllipseRadius = 0.45f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 19.0f, y1 = 11.0f)
                verticalLineToRelative(dy = 1.1f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.25f, dx2 = 0.2f, dy2 = 0.45f, dx3 = 0.45f, dy3 = 0.45f)
                horizontalLineToRelative(dx = 1.1f)
                curveToRelative(dx1 = 0.25f, dy1 = 0.0f, dx2 = 0.45f, dy2 = -0.2f, dx3 = 0.45f, dy3 = -0.45f)
                verticalLineTo(y = 11.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.25f, dx2 = -0.2f, dy2 = -0.45f, dx3 = -0.45f, dy3 = -0.45f)
                close()
                moveToRelative(dx = -14.9f, dy = 3.5f)
                horizontalLineToRelative(dx = -1.1f)
                arcTo(horizontalEllipseRadius = 1.95f, verticalEllipseRadius = 1.95f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 1.5f, y1 = 12.1f)
                verticalLineTo(y = 11.0f)
                arcToRelative(a = 1.95f, b = 1.95f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.95f, dy1 = -1.95f)
                horizontalLineToRelative(dx = 1.1f)
                arcTo(horizontalEllipseRadius = 1.95f, verticalEllipseRadius = 1.95f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.5f, y1 = 11.0f)
                verticalLineToRelative(dy = 1.1f)
                arcToRelative(a = 1.95f, b = 1.95f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.95f, dy1 = 1.95f)
                moveToRelative(dx = -1.1f, dy = -3.5f)
                arcTo(horizontalEllipseRadius = 0.45f, verticalEllipseRadius = 0.45f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 3.0f, y1 = 11.0f)
                verticalLineToRelative(dy = 1.1f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.25f, dx2 = 0.2f, dy2 = 0.45f, dx3 = 0.45f, dy3 = 0.45f)
                horizontalLineToRelative(dx = 1.1f)
                curveTo(x1 = 4.8f, y1 = 12.56f, x2 = 5.0f, y2 = 12.36f, x3 = 5.0f, y3 = 12.1f)
                verticalLineTo(y = 11.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.25f, dx2 = -0.2f, dy2 = -0.45f, dx3 = -0.45f, dy3 = -0.45f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.54f, y = 10.85f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                lineToRelative(dx = -5.3f, dy = -5.3f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                lineToRelative(dx = 5.3f, dy = 5.3f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = 0.22f)
                moveToRelative(dx = -13.08f, dy = 0.0f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                lineToRelative(dx = 5.3f, dy = -5.3f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = -5.3f, dy = 5.3f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = 0.22f)
            }
        }.build().also { _penTool = it }
    }

@Suppress("ObjectPropertyName")
private var _penTool: ImageVector? = null
