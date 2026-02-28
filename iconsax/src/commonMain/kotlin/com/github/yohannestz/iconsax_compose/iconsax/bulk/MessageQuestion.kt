package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessageQuestion: ImageVector
    get() {
        val current = _messageQuestion
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MessageQuestion",
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
                moveTo(x = 17.0f, y = 18.43f)
                horizontalLineToRelative(dx = -4.0f)
                lineToRelative(dx = -4.45f, dy = 2.96f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.0f, y1 = 20.56f)
                verticalLineToRelative(dy = -2.13f)
                curveToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -5.0f, dy2 = -2.0f, dx3 = -5.0f, dy3 = -5.0f)
                verticalLineToRelative(dy = -6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = 2.0f, dy2 = -5.0f, dx3 = 5.0f, dy3 = -5.0f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = 2.0f, dx3 = 5.0f, dy3 = 5.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = -2.0f, dy2 = 5.0f, dx3 = -5.0f, dy3 = 5.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 12.11f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineToRelative(dy = -0.21f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.16f, dx2 = 0.85f, dy2 = -1.73f, dx3 = 1.17f, dy3 = -1.95f)
                curveToRelative(dx1 = 0.37f, dy1 = -0.25f, dx2 = 0.49f, dy2 = -0.42f, dx3 = 0.49f, dy3 = -0.68f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.5f, dx2 = -0.41f, dy2 = -0.91f, dx3 = -0.91f, dy3 = -0.91f)
                reflectiveCurveToRelative(dx1 = -0.91f, dy1 = 0.41f, dx2 = -0.91f, dy2 = 0.91f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 9.59f, y1 = 8.93f, x2 = 9.59f, y2 = 8.52f)
                arcToRelative(a = 2.41f, b = 2.41f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.82f, dy1 = 0.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.14f, dx2 = -0.84f, dy2 = 1.71f, dx3 = -1.15f, dy3 = 1.92f)
                curveToRelative(dx1 = -0.39f, dy1 = 0.26f, dx2 = -0.51f, dy2 = 0.43f, dx3 = -0.51f, dy3 = 0.71f)
                verticalLineToRelative(dy = 0.21f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 12.11f)
                moveToRelative(dx = 0.0f, dy = 2.5f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.5f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
            }
        }.build().also { _messageQuestion = it }
    }

@Suppress("ObjectPropertyName")
private var _messageQuestion: ImageVector? = null
