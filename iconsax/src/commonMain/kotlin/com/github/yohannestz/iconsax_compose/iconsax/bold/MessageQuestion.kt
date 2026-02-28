package com.github.yohannestz.iconsax_compose.iconsax.bold

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
            ) {
                moveTo(x = 17.0f, y = 2.43f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -5.0f, dy2 = 2.0f, dx3 = -5.0f, dy3 = 5.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = 2.0f, dy2 = 5.0f, dx3 = 5.0f, dy3 = 5.0f)
                verticalLineToRelative(dy = 2.13f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.55f, dy1 = 0.83f)
                lineTo(x = 13.0f, y = 18.43f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = -2.0f, dx3 = 5.0f, dy3 = -5.0f)
                verticalLineToRelative(dy = -6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = -2.0f, dy2 = -5.0f, dx3 = -5.0f, dy3 = -5.0f)
                moveTo(x = 12.0f, y = 14.6f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.5f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
                moveToRelative(dx = 1.26f, dy = -4.15f)
                curveToRelative(dx1 = -0.39f, dy1 = 0.26f, dx2 = -0.51f, dy2 = 0.43f, dx3 = -0.51f, dy3 = 0.71f)
                verticalLineToRelative(dy = 0.21f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -0.21f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.16f, dx2 = 0.85f, dy2 = -1.73f, dx3 = 1.17f, dy3 = -1.95f)
                curveToRelative(dx1 = 0.37f, dy1 = -0.25f, dx2 = 0.49f, dy2 = -0.42f, dx3 = 0.49f, dy3 = -0.68f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.5f, dx2 = -0.41f, dy2 = -0.91f, dx3 = -0.91f, dy3 = -0.91f)
                reflectiveCurveToRelative(dx1 = -0.91f, dy1 = 0.41f, dx2 = -0.91f, dy2 = 0.91f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 9.59f, y1 = 8.94f, x2 = 9.59f, y2 = 8.53f)
                arcToRelative(a = 2.41f, b = 2.41f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.82f, dy1 = 0.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.14f, dx2 = -0.84f, dy2 = 1.71f, dx3 = -1.15f, dy3 = 1.92f)
            }
        }.build().also { _messageQuestion = it }
    }

@Suppress("ObjectPropertyName")
private var _messageQuestion: ImageVector? = null
